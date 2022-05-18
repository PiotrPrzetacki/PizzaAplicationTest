package pl.przetacki.pizzaaplicationtest.remote.rest.dto.request;

import java.util.List;

public class AddOrderDto {
    private List<PizzaOrderDto> pizzas;
    private PersonDto person;

    public AddOrderDto() {
    }

    public AddOrderDto(List<PizzaOrderDto> pizzas, PersonDto person) {
        this.pizzas = pizzas;
        this.person = person;
    }

    public List<PizzaOrderDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaOrderDto> pizzas) {
        this.pizzas = pizzas;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
