package com.demo.repository;

import com.demo.domain.Type;
import javax.persistence.Query;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;

//#public interface {{_key}}Repository extends CrudRepository<{{_key}}, {{idClass}}> {
//#{{#each graphql.json.type.Query}}
//#{{#if (eval type '==' ../_key)}}
//#    // use query that best maps to the generated method:
//#    @Query("from {{type}}")
//#    {{#if (eval array '==' true)}}List<{{/if}}{{type}}{{#if (eval this.array '==' true)}}>{{/if}} {{@key}}({{#join args}}{{map ../../typeMappings.json type}} {{@key}}{{/join}});
//#{{/if}}
//#{{/each}}
//#
//#{{#each graphql.json.type.Mutation}}
//#{{#if (eval type '==' ../_key)}}
//#    // use query that best maps to the generated method:
//#    @Query("from {{type}}")
//#    @Modifying
//#    {{#if (eval array '==' true)}}List<{{/if}}{{type}}{{#if (eval this.array '==' true)}}>{{/if}} {{@key}}({{#join args}}{{map ../../typeMappings.json type}} {{@key}}{{/join}});
//#{{/if}}
//#{{/each}}
//#}
