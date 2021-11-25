package com.demo.controller;

import com.demo.domain.*;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class GraphQLController {
//#{{#each graphql.json.definitions}}
//#{{#if (eval @key 'notIn' (array 'String' 'Boolean' 'Int'))}}
//#    private final {{@key}}Repository {{lowerCase @key}}Repository;
//#{{/if}}
//#{{/each}}

//#{{#each graphql.json.properties.Query.properties}}
//#    @QueryMapping
//#    public {{#if (eval this.properties.return.type '==' 'array')}}List<{{/if}}{{type}}{{#if (eval this.properties.return.type '==' 'array')}}>{{/if}} {{@key}}({{#join args}}@Argument {{map ../../typeMappings.json type}} {{@key}}{{/join}}) {
//#        return {{lowerCase type}}Repository.{{@key}}({{#join args}}{{@key}}{{/join}});
//#    }
//#{{/each}}
//#
//#{{#each graphql.json.type.Mutation}}
//#    @MutationMapping
//#    public {{#if (eval this.properties.return.type '==' 'array')}}List<{{/if}}{{type}}{{#if (eval this.properties.return.type '==' 'array')}}>{{/if}} {{@key}}({{#join args}}@Argument {{map ../../typeMappings.json type}} {{@key}}{{/join}}) {
//#        return {{lowerCase type}}Repository.{{@key}}({{#join args}}{{@key}}{{/join}});
//#    }
//#{{/each}}

}
