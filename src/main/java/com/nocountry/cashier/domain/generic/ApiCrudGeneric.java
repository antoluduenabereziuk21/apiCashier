package com.nocountry.cashier.domain.generic;

import org.springframework.data.domain.Page;

import java.util.Optional;

/**
 * @author ROMULO
 * @package com.nocountry.cashier.domain.generic
 * @license Lrpa, zephyr cygnus
 * @since 9/10/2023
 */
public interface ApiCrudGeneric<T, E, A, ID> {
    E create(T data);
    Page<E> getAll(A pageable);
    Optional<E> getById(ID id);
    E update(ID id, T data);
    boolean delete(ID id);

}
