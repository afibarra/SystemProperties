package application.rest;

import model.Person;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class LibertyRestEndpoint {

//    private EntityManager entityManager;
//
//    @PostConstruct
//    private void setup() {
//        entityManager = Persistence.createEntityManagerFactory("puPostgres").createEntityManager();
//    }

    @GET
    public String hello() {
        EntityManager entityManager = Persistence.createEntityManagerFactory("puPostgres").createEntityManager();
        entityManager.persist(new Person("Armando"));

        return "Hello from the REST endpoint!";
    }
}
