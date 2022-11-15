package com.hei_note.gestion.service;

import com.hei_note.gestion.model.Group_2;
import com.hei_note.gestion.repository.GroupRespository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GroupService {
    private GroupRespository groupRespository;

    //GET mapping
        //1.get all groups in HEI school
    public List<Group_2> getAllGroups(int page, int pageSize){
        Pageable pageable = PageRequest.of((page - 1), pageSize);
        return groupRespository.findAll(pageable).toList();
    }

    //POST mapping
        //1.insert one by one 1 group
    public Group_2 insertGroup(Group_2 groupToInsert){
        Group_2 newGroup = new Group_2();
        newGroup.setNameGroup(groupToInsert.getNameGroup());
        newGroup.setYear(groupToInsert.getYear());
        groupRespository.save(newGroup);

        return newGroup;
    }

    //PUT mapping
        //1.modify group by name or year
    public Group_2 putModification(Group_2 groupToModify){
        Group_2 thisGroup = groupRespository.findById(groupToModify.getId())
                .orElseThrow(() -> new NullPointerException("not found"));
        if(groupToModify.getNameGroup() != null){
            thisGroup.setNameGroup(groupToModify.getNameGroup());
        }
        if(groupToModify.getYear() != null){
            thisGroup.setYear(groupToModify.getYear());
        }
        groupRespository.save(thisGroup);
        return thisGroup;
    }
}
