package jm.study.program.jpa;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
@SpringBootTest
public class JpqlTest {
    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void jqpl_select() throws Exception {
        //given
//        String query = "drop all objects";
//        List<String> tableNames = Arrays.asList("CATEGORY","CATEGORY_ITEM","DELIVERY","ITEM","MEMBER","ORDERS","ORDER_ITEM");

        //when

        //then

        entityManager.createQuery("select c from Category c").getResultList();
        //entityManager.createQuery("select c from Category c").getResultList();

    }
}
