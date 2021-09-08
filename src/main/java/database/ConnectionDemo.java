package database;

import entities.DailyPrice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ConnectionDemo {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("stock-manager");
        EntityManager em = emf.createEntityManager();

        String jpql = "select p from DailyPrice p";
        TypedQuery<DailyPrice> query = (TypedQuery<DailyPrice>) em.createQuery(jpql);
        List<DailyPrice> dailyPriceList = query.getResultList();
        dailyPriceList.forEach(System.out::println);

        em.close();
        emf.close();
    }
}
