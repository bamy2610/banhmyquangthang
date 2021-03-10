package YM.shop.project.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import YM.shop.project.Entities.TaiKhoan;
import YM.shop.project.Repositories.TaikhoanReponsitory;

@Service
public class TaikhoanServiceImpl implements TaikhoanService {
	@Autowired
	private TaikhoanReponsitory taikhoanReponsitory;
	
	@Override
	public TaiKhoan save(TaiKhoan entity) {
		return taikhoanReponsitory.save(entity);
	}

	@Override
	public List<TaiKhoan> saveAll(List<TaiKhoan> entities) {
		return (List<TaiKhoan>) taikhoanReponsitory.saveAll(entities);
	}

	@Override
	public Optional<TaiKhoan> findById(Integer id) {
		return taikhoanReponsitory.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return taikhoanReponsitory.existsById(id);
	}

	@Override
	public Iterable<TaiKhoan> findAll() {
		return taikhoanReponsitory.findAll();
	}

	@Override
	public List<TaiKhoan> findAllById(Iterable<Integer> ids) {
		return (List<TaiKhoan>) taikhoanReponsitory.findAllById(ids);
	}

	@Override
	public long count() {
		return taikhoanReponsitory.count();
	}

	@Override
	public void deleteById(Integer id) {
		taikhoanReponsitory.deleteById(id);
	}

	@Override
	public void delete(TaiKhoan entity) {
		taikhoanReponsitory.delete(entity);
	}

	@Override
	public void deleteAll(List<TaiKhoan> entities) {
		taikhoanReponsitory.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		taikhoanReponsitory.deleteAll();
	}
	
	
}
