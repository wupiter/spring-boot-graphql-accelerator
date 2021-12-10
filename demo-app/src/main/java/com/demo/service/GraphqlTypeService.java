package com.demo.service;

import com.demo.domain.*;
import com.demo.repository.*;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class GraphqlTypeService {
//#{{#each graphql.json.definitions}}
//#{{#if (eval @key 'notIn' (array 'String' 'Boolean' 'Int' 'ID'))}}
//#    private final {{@key}}Repository {{lowerCase @key}}Repository;
//#{{/if}}
//#{{/each}}

//#{{#each graphql.json.properties.Query.properties}}
//#{{#graphqlOp this @key}}
//#{{#if (eval type '==' ../_key)}}
//#    @Transactional(readOnly = true)
//#    public {{#if (eval return.array '==' true)}}List<{{/if}}{{return.type}}{{#if (eval return.array '==' true)}}>{{/if}} {{@key}}({{#join args}}{{map ../../../typeMappings.json type}} {{@key}}{{/join}}) {
//#        return {{lowerCase this.return.type}}Repository.{{@key}}({{#join args}}{{@key}}{{/join}});
//#    }
//#{{/if}}
//#{{/graphqlOp}}
//#{{/each}}
//#
//#{{#each graphql.json.properties.Mutation.properties}}
//#{{#graphqlOp this @key}}
//#{{#if (eval type '==' ../_key)}}
//#    public {{#if (eval this.return.array '==' true)}}List<{{/if}}{{this.return.type}}{{#if (eval this.return.array '==' true)}}>{{/if}} {{this.name}}({{#join this.args}}{{map ../../../typeMappings.json type}} {{@key}}{{/join}}) {
//#        return {{lowerCase this.return.type}}Repository.{{@key}}({{#join args}}{{@key}}{{/join}});
//#    }
//#{{/if}}
//#{{/graphqlOp}}
//#{{/each}}
}
