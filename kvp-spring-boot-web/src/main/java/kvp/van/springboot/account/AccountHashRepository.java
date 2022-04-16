package kvp.van.springboot.account;

import org.springframework.data.repository.CrudRepository;

public interface AccountHashRepository extends CrudRepository<AccountHash, String> {
}
