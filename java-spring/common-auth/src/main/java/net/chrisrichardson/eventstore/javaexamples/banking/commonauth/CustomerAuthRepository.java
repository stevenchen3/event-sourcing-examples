package net.chrisrichardson.eventstore.javaexamples.banking.commonauth;

import net.chrisrichardson.eventstore.javaexamples.banking.common.customers.QuerySideCustomer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

interface CustomerAuthRepository extends MongoRepository<QuerySideCustomer, String> {

  List<QuerySideCustomer> findByEmail(String email);
}