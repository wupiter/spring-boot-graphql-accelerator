package com.demo.domain;

import lombok.Data;
import java.util.List;
import javax.persistence.*;
//#{{#if (eval (map typeMappings.json 'ID') '==' 'String')}}
import org.hibernate.annotations.GenericGenerator;
//#{{/if}}

//a{{{toJSON this}}}
//#{{#graphqlType _item _key}}
//#{{#if (eval enum '==' true)}}
//#public enum GraphqlType {
//#    {{#join enumValues}}{{this}}{{/join}}
//#}
//#{{else}}
//#@Entity
//#@Data
//#public class {{name}} {
//b{{{toJSON this}}}
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
//#{{#if (eval array '==' true)}}
//#    @OneToMany
//#{{/if}}
//{{map ../../../typeMappings.json type}}
//c{{{toJSON this}}}
//1{{{toJSON ../typeMappings.json}}}
//2{{{toJSON ../../typeMappings.json}}}
//3{{{toJSON ../../../typeMappings.json}}}
//4{{{toJSON ../../../../typeMappings.json}}}
//#    private {{#if (eval array '==' true)}}List<{{/if}}{{#if (map ../../typeMappings.json type)}}{{map ../../typeMappings.json type}}{{else}}{{type}}{{/if}}{{#if (eval array '==' true)}}>{{/if}} {{@key}};
//#{{/each}}
//#}
//#{{/if}}
//#{{/graphqlType}}
