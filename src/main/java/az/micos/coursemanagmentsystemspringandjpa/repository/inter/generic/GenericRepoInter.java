package az.micos.coursemanagmentsystemspringandjpa.repository.inter.generic;

public interface GenericRepoInter<T> {
    void create(T entity);

    void update(T entity);

    void delete(T entity);

    T getById(String id);

    T getAll();

}
