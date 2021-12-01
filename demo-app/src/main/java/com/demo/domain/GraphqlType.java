package com.demo.domain;

import lombok.Data;
import javax.persistence.*;
//#{{#if (eval (map typeMappings.json 'ID') '==' 'String')}}
import org.hibernate.annotations.GenericGenerator;
//#{{/if}}

//#{{#graphqlType _item _key}}
//#{{{toJSON this}}}
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
//#{{#if (eval (map ../../typeMappings.json type) '!=' '')}}
//#    private {{map ../../typeMappings.json type}} {{@key}};
//#{{else}}
//#    private {{#if (eval array '==' true)}}List<{{/if}}{{type}}{{#if (eval array '==' true)}}>{{/if}} {{@key}};
//#{{/if}}
//#{{/each}}
//#}
//#{{/if}}
//#{{/graphqlType}}
