/*
 * Isotope 1.6
 * Copyright (C) 2019 IpsoSenso
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package isotope.modules.cm.valuelist.service;

import isotope.commons.services.CrudEntityService;
import isotope.modules.cm.valuelist.model.ValueList;
import isotope.modules.cm.valuelist.repository.ValueListRepository;
import org.springframework.stereotype.Service;

@Service
public class ValueListService extends CrudEntityService<ValueListRepository, ValueList, Long> {
    /**
     * Base constructor
     *
     * @param repository
     */
    public ValueListService(ValueListRepository repository) {
        super(repository);
    }
}
