package com.demo.domain;

import lombok.Data;
import javax.persistence.*;

//#@Entity
//#{{{toJSON this}}}
@Data
public class Type {
//#{{#each _item}}
//#{{#if (eval type '==' 'ID')}}
//#    @Id
//#{{#if (eval idClass '==' 'String')}}
//#    @GeneratedValue(generator = "uuid")
//#    @GenericGenerator(name = "uuid", strategy = "uuid2")
//#{{else}}
//#    @GeneratedValue
//#{{/if}}
//#{{/if}}
//#    private {{#if (eval type '==' 'ID')}}{{../idClass}}{{else}}{{this.type}}{{/if}} {{@key}};
//#{{/each}}
}