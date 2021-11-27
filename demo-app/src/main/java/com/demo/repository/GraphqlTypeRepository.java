package com.demo.repository;

import com.demo.domain.GraphqlType;
import javax.persistence.Query;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;

//#public interface {{_key}}Repository extends CrudRepository<{{_key}}, {{map typeMappings.json 'ID'}}> {
//#{{#each graphql.json.properties.Query.properties}}
//#{{#graphqlOp this @key}}
//#{{{toJSON this}}}
//#{{#if (eval type '==' ../_key)}}
//#    // use JQL query that best maps to below generated method:
//#    @Query("from {{type}}")
//#    {{#if (eval return.array '==' true)}}List<{{/if}}{{return.type}}{{#if (eval return.array '==' true)}}>{{/if}} {{@key}}({{#join args}}{{map ../../../typeMappings.json type}} {{@key}}{{/join}});
//#{{/if}}
//#{{/graphqlOp}}
//#{{/each}}
//#
//#{{#each graphql.json.properties.Mutation.properties}}
//#{{#graphqlOp this @key}}
//#{{#if (eval type '==' ../_key)}}
//#    // use JQL query that best maps to below generated method:
//#    @Query("from {{type}}")
//#    @Modifying
//#    {{#if (eval return.array '==' true)}}List<{{/if}}{{return.type}}{{#if (eval return.array '==' true)}}>{{/if}} {{@key}}({{#join args}}{{map ../../../typeMappings.json type}} {{@key}}{{/join}});
//#{{/if}}
//#{{/graphqlOp}}
//#{{/each}}
//#}
