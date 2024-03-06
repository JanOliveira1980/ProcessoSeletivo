# Processo Seletivo

Este é um programa simples em Java que simula um processo seletivo para uma empresa. O programa seleciona candidatos com base em seus salários pretendidos e toma decisões com base nesses salários.

## Funcionamento

O programa consiste em duas principais funções:

1. `selecaoCandidatos()`: Esta função simula a seleção de candidatos. Inicialmente, uma lista de candidatos é definida. O programa então itera sobre essa lista, verificando se o salário base oferecido pela empresa é maior ou igual ao salário pretendido pelo candidato. Se sim, o candidato é selecionado.

2. `analisarCandidato(double salarioPretendido)`: Esta função analisa o salário pretendido de um único candidato e decide o que fazer com base nesse valor e no salário base da empresa.

## Como executar

Para executar o programa, basta chamar o método `main()` na classe `ProcessoSeletivo`.

```
java ProcessoSeletivo
```

Lembre-se de que algumas partes do código estão comentadas (`/* */`). Você pode descomentar essas partes para testar a análise de candidatos individuais.

## Observações

- Este é apenas um exemplo simplificado e não representa um processo seletivo real.
- O programa utiliza a classe `ThreadLocalRandom` para gerar valores aleatórios de salário pretendido.

Sinta-se à vontade para modificar e expandir este programa de acordo com suas necessidades específicas. 🚀