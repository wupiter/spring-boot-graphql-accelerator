package com.demo.service;

import com.demo.domain.*;
import com.demo.repository.*;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
@RequiredArgsConstructor
public class GraphqlTypeService {
//#{{#each graphql.json.definitions}}
//#{{#if (eval @key 'notIn' ../graphqlScalars.json)}}
//#    private final {{@key}}Repository {{lowerCase @key}}Repository;
//#{{/if}}
//#{{/each}}

//#{{#each graphql.json.properties.Query.properties}}
//#{{#graphqlOp this @key}}
//#{{#if (eval return.type '==' ../../_itemKey)}}
//#    @Transactional(readOnly = true)
//#    public {{#if (eval return.array '==' true)}}List<{{/if}}{{return.type}}{{#if (eval return.array '==' true)}}>{{/if}} {{@key}}({{#join args}}{{map ../../../typeMappings.json type}} {{@key}}{{/join}}) {
//#        // You may need to replace generated code with correct business logic:  
//#        return {{lowerCase this.return.type}}Repository.{{@key}}({{#join args}}{{@key}}{{/join}});
//#    }
//#
//#{{/if}}
//#{{/graphqlOp}}
//#{{/each}}
//#{{#each graphql.json.properties.Mutation.properties}}
//#{{#graphqlOp this @key}}
//#{{#if (eval return.type '==' ../../_itemKey)}}
//#    public {{#if (eval this.return.array '==' true)}}List<{{/if}}{{this.return.type}}{{#if (eval this.return.array '==' true)}}>{{/if}} {{this.name}}({{#join this.args}}{{map ../../../typeMappings.json type}} {{@key}}{{/join}}) {
//#        // You may need to replace generated code with correct business logic:  
//#        return {{lowerCase this.return.type}}Repository.{{@key}}({{#join args}}{{@key}}{{/join}});
//#    }
//#
//#{{/if}}
//#{{/graphqlOp}}
//#{{/each}}
}
