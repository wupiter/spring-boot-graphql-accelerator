package com.demo.domain;

import lombok.Data;
import javax.persistence.*;

//#{{#graphqlType _item _key}}
//#{{#if (eval enum '==' true)}}
//#public enum GraphqlType {
//#    {{#join enumValues}}{{this}}{{/join}}
//#}
//#{{else}}
//#@Entity
@Data
public class GraphqlType {
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
//#    private {{map ../../typeMappings.json type}} {{@key}};
//#{{/each}}
}
//#{{/if}}
//#{{/graphqlType}}
