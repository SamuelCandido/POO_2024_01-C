# Lista de Exercícios 07a - Resumo Objetivo

## Questão 1:
### Classe Imovel
- **Objetivo:** Calcular o Imposto Predial e Territorial Urbano (IPTU) de um imóvel.
- **Atributos:**
  - `endereco`: Endereço do imóvel.
  - `area`: Área do imóvel em m².
  - `bairro`: Bairro do imóvel.
  - `finalidade`: Finalidade do imóvel (residencial, comercial ou industrial).
  - `coeficienteIptu`: Coeficiente de IPTU, definido por bairro.
- **Cálculo do IPTU:**
  - **Residencial:** R$ 1,00 por m².
  - **Comercial:** 
    - Até 100 m²: R$ 500,00.
    - De 101 m² até 400 m²: R$ 1.000,00.
    - Acima de 400 m²: R$ 2,55 por m².
  - **Industrial:**
    - Até 2.000 m²: R$ 1.000,00.
    - Acima de 2.000 m²: R$ 0,55 por m².
- **Validações:**
  - Área não pode ser negativa.
  - Não calcular IPTU sem definir o bairro, finalidade ou área.
  - Coeficiente do bairro não pode ser negativo.

## Questão 2:
### Plano de Testes PL01 – Validar Funcionamento da Classe Imovel

| Caso | Descrição | Entrada | Saída Esperada |
|------|-----------|---------|----------------|
| 1 | Certificar-se que área negativa é recusada | Área = -5 m² | Exceção `IllegalArgumentException` |
| 2 | Certificar-se que IPTU não é calculado sem área | Imóvel residencial, bairro "Centro", coeficiente = 1 | Exceção `IllegalArgumentException` |
| 3 | Certificar-se que IPTU não é calculado sem finalidade | Imóvel no bairro "Centro", coeficiente = 1, área = 250 m² | Exceção `IllegalArgumentException` |
| 4 | Certificar-se que IPTU não é calculado sem bairro | Imóvel residencial, área = 400 m² | Exceção `IllegalArgumentException` |
| 5 | Calcular IPTU para imóvel residencial | Bairro com coeficiente = 1, área = 400 m² | R$ 400,00 |
| 6 | Calcular IPTU para imóvel comercial até 100 m² | Bairro com coeficiente = 1, área = 80 m² | R$ 500,00 |
| 7 | Calcular IPTU para imóvel comercial entre 100 e 400 m² | Bairro com coeficiente = 1, área = 250 m² | R$ 1.000,00 |
| 8 | Calcular IPTU para imóvel comercial acima de 400 m² | Bairro com coeficiente = 1, área = 500 m² | R$ 1.275,00 |
| 9 | Calcular IPTU para imóvel industrial até 2.000 m² | Bairro com coeficiente = 1, área = 2.000 m² | R$ 1.000,00 |
| 10 | Calcular IPTU para imóvel industrial acima de 2.000 m² | Bairro com coeficiente = 1, área = 3.000 m² | R$ 1.650,00 |
| 11 | Calcular IPTU para imóvel com coeficiente de bairro 2,5 | Bairro com coeficiente = 2,5, área = 500 m² | R$ 1.250,00 |

## Questão 3:
### Aplicação Gráfica para Calcular o IPTU
- **Objetivo:** Criar uma aplicação gráfica onde o usuário informa dados do imóvel (endereço, área, finalidade e bairro) e calcula o valor do IPTU.
- **Entradas do Usuário:**
  - Endereço do imóvel.
  - Área em m².
  - Finalidade do imóvel (residencial, comercial, industrial).
  - Bairro do imóvel.
- **Saída:** Valor do IPTU calculado conforme as regras definidas.
