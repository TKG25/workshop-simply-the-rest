package nl.han.oose.dea.rest.services;

import nl.han.oose.dea.rest.services.dto.ItemDTO;
import nl.han.oose.dea.rest.services.dto.UserDTO;
import nl.han.oose.dea.rest.services.exceptions.IdAlreadyInUseException;
import nl.han.oose.dea.rest.services.exceptions.ItemNotAvailableException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserService {

    private List<UserDTO> userInfo = new ArrayList<>();

    public void addUser(UserDTO userDTO) {

        userInfo.add(userDTO);
    }

//    /**
//     * Return a specific {@link ItemDTO} with the given Id.
//     *
//     * @param id The Id of the {@link ItemDTO} to be returned
//     * @throws ItemNotAvailableException Thrown if there is no {@link ItemDTO} for the given Id
//     */
//    public ItemDTO getItem(int id) {
//        Optional<ItemDTO> requestedItem = items.stream().filter(item -> item.getId() == id).findFirst();
//
//        if (requestedItem.isPresent()) {
//            return requestedItem.get();
//        } else {
//            throw new ItemNotAvailableException();
//        }
//    }

//    /**
//     * Delete a specific {@link ItemDTO} with the given Id.
//     *
//     * @throws ItemNotAvailableException Thrown if there is no {@link ItemDTO} for the given Id
//     */
//    public void deleteItem(int id) {
//        Optional<ItemDTO> itemForName = items.stream().filter(item -> item.getId() == id).findFirst();
//
//        List<ItemDTO> filteredItems = items.stream().filter(item -> item.getId() != id).collect(Collectors.toList());
//
//        if (filteredItems.size() == items.size()) {
//            throw new ItemNotAvailableException();
//        }
//
//        items = filteredItems;
//    }

}
