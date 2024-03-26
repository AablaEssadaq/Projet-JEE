package com.example.projet_jee.ws.converter.achat;

import com.example.projet_jee.beans.achat.AchatMaterielDetail;
import com.example.projet_jee.ws.dto.achat.AchatMaterielDetailDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AchatMaterielDetailConverter {

  public AchatMaterielDetail toBean(AchatMaterielDetailDto materielDetailDto){
      AchatMaterielDetail achatMaterielDetail = new AchatMaterielDetail();
      achatMaterielDetail.setId(materielDetailDto.getId());
      achatMaterielDetail.setProduit(materielDetailDto.getProduit());
      achatMaterielDetail.setQteAchetee(materielDetailDto.getQteAchetee());
      achatMaterielDetail.setQteLivree(materielDetailDto.getQteLivree());
      achatMaterielDetail.setQteRecue(materielDetailDto.getQteRecue());
      achatMaterielDetail.setAchatMeteriel(materielDetailDto.getAchatMeteriel());
      return achatMaterielDetail;
  }

  public AchatMaterielDetailDto toDto(AchatMaterielDetail achatMaterielDetail){
      AchatMaterielDetailDto materielDetailDto = new AchatMaterielDetailDto();
      materielDetailDto.setId(achatMaterielDetail.getId());
      materielDetailDto.setProduit(achatMaterielDetail.getProduit());
      materielDetailDto.setAchatMeteriel(achatMaterielDetail.getAchatMeteriel());
      materielDetailDto.setQteAchetee(achatMaterielDetail.getQteAchetee());
      materielDetailDto.setQteRecue(achatMaterielDetail.getQteRecue());
      materielDetailDto.setQteLivree(achatMaterielDetail.getQteLivree());
      return materielDetailDto;
  }

    public List<AchatMaterielDetail> toBean(List<AchatMaterielDetailDto> dtos) {
        return dtos.stream().map(e -> toBean(e)).collect(Collectors.toList());
    }
    public List<AchatMaterielDetailDto> toDto(List<AchatMaterielDetail> beans) {
        return beans.stream().map(e -> toDto(e)).collect(Collectors.toList());
    }


}
