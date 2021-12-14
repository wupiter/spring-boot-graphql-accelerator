Template files used for the Wupiter GraphQL to Spring Boot code generator.

# Sample GraphQL schema
```
type Tweet {
    id: ID!
    # The tweet text. No more than 140 characters!
    body: String
    # When the tweet was published
    createdAt: DateTime
    # Who published the tweet
    author: String
}

scalar DateTime

type Query {
    Tweet(id: ID!): Tweet
    Tweets(limit: Int, skip: Int, sort_field: String, sort_order: String): [Tweet]
}

type Mutation {
    createTweet (
        body: String
    ): Tweet
}
```