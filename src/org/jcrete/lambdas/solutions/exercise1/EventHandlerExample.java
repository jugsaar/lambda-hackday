/*
 * #%L
 * lambda-tutorial
 * %%
 * Copyright (C) 2013 Adopt OpenJDK
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */
package org.jcrete.lambdas.solutions.exercise1;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Convert the anonymous methods to λ-expressions
 */
public class EventHandlerExample {
    public static void main(String[] args) {
        // TODO: Convert it to λ-expression
        SwingUtilities.invokeLater(() -> createGUI());
    }

	private static void createGUI() {
        final JFrame frame = new JFrame();
        JButton button = new JButton("Click me!");
        // TODO: Convert it to λ-expression
        // ActionListener listener = e -> JOptionPane.showMessageDialog(frame, "Button clicked!");
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button clicked!"));
        frame.getContentPane().add(button);
        frame.setSize(100, 80);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
