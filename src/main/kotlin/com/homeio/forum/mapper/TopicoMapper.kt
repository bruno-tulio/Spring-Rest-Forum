package com.homeio.forum.mapper

import com.homeio.forum.dto.TopicoDto
import com.homeio.forum.model.Topico
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings
import org.mapstruct.factory.Mappers


@Mapper
interface TopicoMapper {

    companion object{
        val INSTANCE =  Mappers.getMapper(TopicoMapper::class.java)
    }

    @Mappings(
        Mapping(target = "id", source = "id"),
        Mapping(target = "titulo", source = "titulo"),
        Mapping(target = "mensagem", source = "mensagem"),
        Mapping(target = "dataCriacao", source = "dataCriacao")
    )
    fun topicoToTopicoDTO(topico: Topico) : TopicoDto

   /* @InheritInverseConfiguration
    fun topicoDtoToTopico(topicoDto: TopicoDto) : Topico*/

}