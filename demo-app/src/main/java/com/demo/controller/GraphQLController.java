package com.demo.controller;

import com.demo.domain.*;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class GraphQLController {
//#{{#each graphql.json.type}}
//#{{#if (eval @key 'notIn' (array 'Query' 'Mutation' 'Subscription'))}}
//#    private final {{@key}}Repository {{lowerCase @key}}Repository;
//#{{/if}}
//#{{/each}}

//#{{#each graphql.json.type.Query}}
//#    @QueryMapping
//#    public {{#if (eval this.array '==' true)}}List<{{/if}}{{type}}{{#if (eval this.array '==' true)}}>{{/if}} {{@key}}({{#join args}}@Argument {{map ../../typeMappings type}} {{@key}}{{/join}}) {
//#        return {{lowerCase type}}Repository.findAll();
//#    }
//#{{/each}}

}
