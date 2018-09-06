package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Random;

@Controller
public class DiceController {

    @GetMapping("/roll-dice")
    private String showPage() {
        return "dice";
    }

    @GetMapping("/roll-dice/{n}")
    private String rollDice(@PathVariable int n, Model model) {
        Random random = new Random();
        int randNo = random.nextInt(6) + 1;

        model.addAttribute("userGuess", n);
        model.addAttribute("winningNo", randNo);

        if (n == randNo) {
            model.addAttribute("outcome", "win");
        } else {
            model.addAttribute("outcome", "lose");
        }
        return "dice";
    }

}
