package mate.academy.spring.service.impl;

import java.util.Optional;
import mate.academy.spring.dao.RoleDao;
import mate.academy.spring.model.Role;
import mate.academy.spring.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role save(Role role) {
        return roleDao.add(role);
    }

    @Override
    public Optional<Role> getByName(Role.RoleName name) {
        return roleDao.getByName(name);
    }
}
