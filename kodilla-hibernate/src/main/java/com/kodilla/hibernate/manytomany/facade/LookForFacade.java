package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LookForFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(LookForFacade.class);

    public void processLookForCompany(String param)
            throws LookForProcessingException {

        boolean wasError = false;

        List<Company> lookingForCompany = companyDao.lookingForCompanyName(param);
        LOGGER.info("Looking for an Employee with those letters: " + param);

        int companyNamesSize = lookingForCompany.size();
        int paramLength = param.length();

        if (paramLength <= 2) {
            LOGGER.error(LookForProcessingException.ERR_NOT_ENOUGH_LETTERS);
            throw new LookForProcessingException(LookForProcessingException.ERR_NOT_ENOUGH_LETTERS);
        }
        try {
            if (companyNamesSize == 0) {
                LOGGER.error(LookForProcessingException.ERR_NO_COMPANY_FOUND);
                    wasError = true;
                    throw new LookForProcessingException(LookForProcessingException.ERR_NO_COMPANY_FOUND);
            }
        } finally {
            if (wasError) {
                LOGGER.info("Look for Company aborded");
            }
        }
    }
}

