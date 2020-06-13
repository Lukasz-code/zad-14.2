package com.kodilla.hibernate.manytomany.facade;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LookForTestSuite {

    @Autowired
    LookForFacade lookForFacade;

    public void testLookForCompany () {
        //Given
       CompaniesDto companies = new CompaniesDto();
       companies.addCompany(new CompanyDto(1,"company1"));
       companies.addCompany(new CompanyDto(2,"company2"));
       companies.addCompany(new CompanyDto(3,"company3"));
       companies.addCompany(new CompanyDto(4,"company4"));

       try{
           lookForFacade.processLookForCompany("%com%");
       }catch (LookForProcessingException e) {

       }

    }

}
