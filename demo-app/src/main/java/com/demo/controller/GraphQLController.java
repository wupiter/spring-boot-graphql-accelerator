package com.demo.controller;

import com.demo.domain.*;
import lombok.RequiredArgsConstructor;
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
//#    public {{#if (eval this.array '==' true)}}List<{{/if}}{{type}}{{#if (eval this.array '==' true)}}>{{/if}} {{@key}}() {
//#        return {{lowerCase type}}Repository.findAll();
//#    }
//#{{/each}}

}
