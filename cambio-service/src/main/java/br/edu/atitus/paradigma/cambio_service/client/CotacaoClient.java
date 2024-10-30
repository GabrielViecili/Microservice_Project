package br.edu.atitus.paradigma.cambio_service.client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CotacaoBCB", url = "https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/odata")
public interface CotacaoClient {

    @GetMapping("/CotacaoMoedaDia(moeda=@moeda,dataCotacao=@dataCotacao)?@moeda='{moeda}'&@dataCotacao='{dataCotacao}'&$format=json")
    CotacaoResponse getCotacao(
        @PathVariable String moeda, 
        @PathVariable String dataCotacao
    );
}