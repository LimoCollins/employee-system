package employee.service;

import employee.entity.Employee;
import employee.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class EmpService {
    @Autowired
    private EmpRepository repository;
    public  void  addEmp(Employee e){
        repository.save(e);
    }
    public List<Employee> getAllEmp(){
       return repository.findAll();
    }
    public Employee getEmpById(int id){
      Optional<Employee> e= repository.findById(id);
      if (e.isPresent() ){
          return e.get();
      }
      return null;
    }
    public  void deleteEmp(int id){
        repository.deleteById(id);
    }
}
