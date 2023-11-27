package com.codeware.pointofsale.controler;

import com.codeware.pointofsale.Dto.ItemDto;
import com.codeware.pointofsale.Dto.Responce.ItemsResponce;
import com.codeware.pointofsale.service.ItemService;
import com.codeware.pointofsale.util.StandardResponce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/items")
@CrossOrigin
public class ItemControler {
    @Autowired
    ItemService itemService;

    @PostMapping("/saveall")
    public ResponseEntity<StandardResponce> saveItems(@RequestBody ItemDto itemDto) {
        String massage = itemService.saveIterm(itemDto);
        ResponseEntity<StandardResponce> responseEntity = new ResponseEntity<StandardResponce>(
                new StandardResponce(201, "sucsses", massage), HttpStatus.CREATED
        );
        return responseEntity;
    }

    @GetMapping("/get-by-name/{name}")
    public ResponseEntity<StandardResponce> getNameAndStatus(@RequestParam(value = "name") String itemname) {
        List<ItemsResponce> itemRseponce = itemService.getNameAndStatus(itemname);
        return new ResponseEntity<StandardResponce>(new StandardResponce(201, "success", itemRseponce), HttpStatus.OK);
    }


}
