package com.demo.repository;

import com.demo.domain.*;
import java.util.List;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

//#public interface {{_itemKey}}Repository extends CrudRepository<{{_itemKey}}, {{mapValue typeMappings.json 'ID'}}> {
//#{{#each graphql.json.properties.Query.properties}}
//#{{#graphqlOp this @key}}
//#{{#if (eval return.type '==' ../../_itemKey)}}
//#    // use JQL query that best maps to below generated method:
//#    @Query("from {{return.type}}")
//#    {{#if (eval return.array '==' true)}}List<{{/if}}{{return.type}}{{#if (eval return.array '==' true)}}>{{/if}} {{@key}}({{#join args}}{{mapValue ../../../typeMappings.json type}} {{@key}}{{/join}});
//#
//#{{/if}}
//#{{/graphqlOp}}
//#{{/each}}
//#{{#each graphql.json.properties.Mutation.properties}}
//#{{#graphqlOp this @key}}
//#{{#if (eval return.type '==' ../../_itemKey)}}
//#    // use JQL query that best maps to below generated method:
//#    @Query("from {{return.type}}")
//#    @Modifying
//#    {{#if (eval return.array '==' true)}}List<{{/if}}{{return.type}}{{#if (eval return.array '==' true)}}>{{/if}} {{@key}}({{#join args}}{{mapValue ../../../typeMappings.json type}} {{@key}}{{/join}});
//#
//#{{/if}}
//#{{/graphqlOp}}
//#{{/each}}
//#}
