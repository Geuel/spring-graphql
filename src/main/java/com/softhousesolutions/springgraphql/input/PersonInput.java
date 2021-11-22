package com.softhousesolutions.springgraphql.input;

import com.softhousesolutions.springgraphql.model.Gender;
import graphql.schema.GraphQLInputType;
import graphql.schema.GraphQLType;
import graphql.schema.GraphQLTypeVisitor;
import graphql.util.TraversalControl;
import graphql.util.TraverserContext;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonInput implements GraphQLInputType {
    @Override
    public String getName() {
        return name;
    }

    @Override
    public TraversalControl accept(TraverserContext<GraphQLType> traverserContext, GraphQLTypeVisitor graphQLTypeVisitor) {
        return null;
    }

    private String name;
    private Integer age;
    private Gender gender;
}
