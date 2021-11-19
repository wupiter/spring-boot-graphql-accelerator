package com.demo.repository;

import com.demo.domain.Type;
import org.springframework.data.repository.CrudRepository;

//#public interface {{_key}}Repository extends CrudRepository<{{_key}}, {{idClass}}> {
//#{{#each graphql.json.type.Query}}
//#{{#if (eval type '==' ../_key)}}
//#    {{#if (eval array '==' true)}}List<{{/if}}{{type}}{{#if (eval this.array '==' true)}}>{{/if}} {{@key}}({{#join args}}{{map ../../typeMappings.json type}} {{@key}}{{/join}});
//#{{/if}}
//#{{/each}}
//#}
