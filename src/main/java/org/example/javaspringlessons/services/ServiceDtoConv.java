package org.example.javaspringlessons.services;

import org.example.javaspringlessons.dto.RequestDto;
import org.example.javaspringlessons.dto.ResponseDto;
import org.springframework.stereotype.Service;

@Service
public class ServiceDtoConv {
    public ResponseDto getDto(RequestDto dto) {
        var resp = new ResponseDto();
        var date = dto.getInfo().getDate();

        resp.setInfo(new ResponseDto.Info());

        var info = resp.getInfo();
        info.setDate(date);
        resp.setPrice(dto.getPrice());

        return resp;
    }
}
