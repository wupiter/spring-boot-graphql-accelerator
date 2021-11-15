package com.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import com.demo.model.*;

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
//#        return {{@key}}Repository.findAll();
//#    }
//#{{/each}}

}
