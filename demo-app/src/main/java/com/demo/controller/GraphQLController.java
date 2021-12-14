package com.demo.controller;

import com.demo.domain.*;
import com.demo.service.*;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class GraphQLController {
//#{{#each graphql.json.definitions}}
//#{{#if (eval @key 'notIn' (array 'String' 'Boolean' 'Int' 'ID'))}}
//#    private final {{@key}}Service {{lowerCase @key}}Service;
//#{{/if}}
//#{{/each}}

//#{{#each graphql.json.properties.Query.properties}}
//#{{#graphqlOp this @key}}
//#    @QueryMapping
//#    public ResponseEntity<{{#if (eval this.return.array '==' true)}}List<{{/if}}{{this.return.type}}{{#if (eval this.return.array '==' true)}}>{{/if}}> {{this.name}}({{#join this.args}}@Argument {{map ../../../typeMappings.json type}} {{@key}}{{/join}}) {
//#        return ResponseEntity.ok({{lowerCase this.return.type}}Service.{{@key}}({{#join args}}{{@key}}{{/join}}));
//#    }
//#
//#{{/graphqlOp}}
//#{{/each}}
//#{{#each graphql.json.properties.Mutation.properties}}
//#{{#graphqlOp this @key}}
//#    @MutationMapping
//#    public ResponseEntity<{{#if (eval this.return.array '==' true)}}List<{{/if}}{{this.return.type}}{{#if (eval this.return.array '==' true)}}>{{/if}}> {{this.name}}({{#join this.args}}@Argument {{map ../../../typeMappings.json type}} {{@key}}{{/join}}) {
//#        return ResponseEntity.ok({{lowerCase this.return.type}}Service.{{@key}}({{#join args}}{{@key}}{{/join}}));
//#    }
//#
//#{{/graphqlOp}}
//#{{/each}}

}
