package YM.shop.project.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import YM.shop.project.Entities.TaiKhoan;

@Repository
public interface TaikhoanReponsitory extends CrudRepository<TaiKhoan, Integer> {

}
