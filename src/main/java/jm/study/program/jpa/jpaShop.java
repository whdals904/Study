package jm.study.program.jpa;

import jm.study.program.jpa.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@SpringBootApplication
public class jpaShop {

    public static void main(String[] args) {
        SpringApplication.run(jpaShop.class, args);
    }
}

