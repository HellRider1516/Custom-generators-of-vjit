package in.mahesh.Repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mahesh.entity.Students;

public interface StudentRepo extends JpaRepository<Students, Serializable>{

}
