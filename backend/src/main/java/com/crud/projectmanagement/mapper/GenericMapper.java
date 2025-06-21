package com.crud.projectmanagement.mapper;

import java.util.List;

public interface GenericMapper <E, D> {
    D toDTO(E e);

    E toEntity(D d);

    List<D> toDTOList(List<E> es);

    List<E> toEntityList(List<D> ds);
}
