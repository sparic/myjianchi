package com.myee.tarot.menu.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMenu is a Querydsl query type for Menu
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMenu extends EntityPathBase<Menu> {

    private static final long serialVersionUID = -22874765L;

    public static final QMenu menu = new QMenu("menu");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<MenuItem, QMenuItem> menuItems = this.<MenuItem, QMenuItem>createList("menuItems", MenuItem.class, QMenuItem.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public QMenu(String variable) {
        super(Menu.class, forVariable(variable));
    }

    public QMenu(Path<? extends Menu> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMenu(PathMetadata metadata) {
        super(Menu.class, metadata);
    }

}

