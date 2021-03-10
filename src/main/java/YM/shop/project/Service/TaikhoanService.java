package YM.shop.project.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import YM.shop.project.Entities.TaiKhoan;
import YM.shop.project.Repositories.TaikhoanReponsitory;

public interface TaikhoanService {

	void deleteAll();

	void deleteAll(List<TaiKhoan> entities);

	void delete(TaiKhoan entity);

	void deleteById(Integer id);

	long count();

	List<TaiKhoan> findAllById(Iterable<Integer> ids);

	Iterable<TaiKhoan> findAll();

	boolean existsById(Integer id);

	Optional<TaiKhoan> findById(Integer id);

	List<TaiKhoan> saveAll(List<TaiKhoan> entities);

	TaiKhoan save(TaiKhoan entity);

	

}
