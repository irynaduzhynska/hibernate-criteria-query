package hibernate.dao;

import hibernate.model.Phone;

import java.util.List;
import java.util.Map;

public interface PhoneDao {
    Phone create(Phone phone);

    List<Phone> findAll(Map<String, String[]> params);
}
