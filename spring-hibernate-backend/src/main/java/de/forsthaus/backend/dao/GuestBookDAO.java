/**
 * Copyright 2010 the original author or authors.
 * 
 * This file is part of Zksample2. http://zksample2.sourceforge.net/
 *
 * Zksample2 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Zksample2 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Zksample2.  If not, see <http://www.gnu.org/licenses/gpl.html>.
 */
package de.forsthaus.backend.dao;

import de.forsthaus.backend.model.GuestBook;

public interface GuestBookDAO {

	/**
	 * EN: Get a new GuestBook object.<br>
	 * DE: Gibt ein neues Gaestebuch Objekt zurueck.<br>
	 * 
	 * @return GuestBook
	 */
	public GuestBook getNewGuestBook();

	/**
	 * EN: Get the count of all GuestBook in the used Table Schema.<br>
	 * DE: Gibt die Anzahl aller Gaestebucheintraege im gewaehlten Tabellen
	 * Schema zurueck.<br>
	 * 
	 * @return int
	 */
	public int getCountAllGuestBook();

	/**
	 * EN: Saves or updates a GuestBook entry.<br>
	 * DE: Speichert oder aktualisiert einen Gaestebuch Eintrag.<br>
	 */
	public void saveOrUpdate(GuestBook guestBook);

	/**
	 * EN: Deletes a GuestBook entry.<br>
	 * DE: Loescht einen Gaestebuch Eintrag.<br>
	 */
	public void delete(GuestBook guestBook);

	/**
	 * EN: Saves a GuestBook entry.<br>
	 * DE: Speichert einen Gaestebuch Eintrag.<br>
	 */
	public void save(GuestBook guestBook);

}
