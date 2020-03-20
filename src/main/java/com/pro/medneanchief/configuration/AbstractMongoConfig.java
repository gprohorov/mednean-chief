package com.pro.medneanchief.configuration;


import com.mongodb.MongoClient;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

public abstract class AbstractMongoConfig {

    //Mongo DB Properties
    private String host;
    private String database;
    private int port;

    public void setHost(String host) {
        this.host = host;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public void setPort(int port) {
        this.port = port;
    }
//Setter methods go above..

    /*
     * Method that creates MongoDbFactory
     * Common to both of the MongoDb connections
     */
    public MongoDbFactory mongoDbFactory() throws Exception {
        return new SimpleMongoDbFactory(new MongoClient(host, port), database);
    }

    /*
     * Factory method to create the MongoTemplate
     */
    abstract public MongoTemplate getMongoTemplate() throws Exception;




}
