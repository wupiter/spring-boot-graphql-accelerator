package com.demo.domain;

import lombok.Data;
import javax.persistence.*;

//#@Entity
//#{{{toJSON _item}}}
//#{{#graphqlType _item _key}}
@Data
public class Type {
//#{{#each fields}}
//#{{#if (eval type '==' 'ID')}}
//#    @Id
//#{{#if (eval idClass '==' 'String')}}
//#    @GeneratedValue(generator = "uuid")
//#    @GenericGenerator(name = "uuid", strategy = "uuid2")
//#{{else}}
//#    @GeneratedValue
//#{{/if}}
//#{{/if}}
//#    private {{#if (eval type '==' 'ID')}}{{../idClass}}{{else}}{{type}}{{/if}} {{@key}};
//#{{/each}}
}
//#{{/graphqlType}}
