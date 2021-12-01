package com.demo.domain;

import lombok.Data;
import javax.persistence.*;
//#{{#if (eval (map typeMappings.json 'ID') '==' 'String')}}
import org.hibernate.annotations.GenericGenerator;
//#{{/if}}

//#{{#graphqlType _item _key}}
//#{{#if (eval enum '==' true)}}
//#public enum GraphqlType {
//#    {{#join enumValues}}{{this}}{{/join}}
//#}
//#{{else}}
//#@Entity
//#@Data
//#public class {{name}} {
//#{{#each fields}}
//#{{#if (eval type '==' 'ID')}}
//#    @Id
//#{{#if (eval (map ../../typeMappings.json type) '==' 'String')}}
//#    @GeneratedValue(generator = "uuid")
//#    @GenericGenerator(name = "uuid", strategy = "uuid2")
//#{{else}}
//#    @GeneratedValue
//#{{/if}}
//#{{/if}}
//{{{toJSON this}}}
//[{{map ../../typeMappings.json type}}]
//#    private {{#if (eval array '==' true)}}List<{{/if}}{{#if (map ../../typeMappings.json type)}}{{map ../../typeMappings.json type}}{{else}}{{type}}{{/if}}{{#if (eval array '==' true)}}>{{/if}} {{@key}};
//#{{/each}}
//#}
//#{{/if}}
//#{{/graphqlType}}
