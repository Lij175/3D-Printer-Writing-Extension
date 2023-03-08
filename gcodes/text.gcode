; base skeleton code for writing

G28 ; Home all axes
G1 Z2 ; Move Z Axis up little to prevent scratching of Heat Bed
G1 X110 Y110 ; go to center

; Stuff Go Here

G0 X50 Y220; go to char orgin
G0 Z0 ; lower to 0
G91 ; relitive positioning

; box
G0 X8 E0.2 
G0 Y13 E0.2 
G0 X-8 E0.2 
G0 Y-13 E0.2
G90 ; absolute positioning
G1 Z1 ; raise a bit

G0 X59 Y220; go to char orgin
G0 Z0 ; lower to 0
G91 ; relitive positioning

; box
G0 X8 E0.2 
G0 Y13 E0.2 
G0 X-8 E0.2 
G0 Y-13 E0.2
G90 ; absolute positioning
G1 Z1 ; raise a bit

G0 X68 Y220; go to char orgin
G0 Z0 ; lower to 0
G91 ; relitive positioning

; box
G0 X8 E0.2 
G0 Y13 E0.2 
G0 X-8 E0.2 
G0 Y-13 E0.2
G90 ; absolute positioning
G1 Z1 ; raise a bit

G0 X77 Y220; go to char orgin
G0 Z0 ; lower to 0
G91 ; relitive positioning

; box
G0 X8 E0.2 
G0 Y13 E0.2 
G0 X-8 E0.2 
G0 Y-13 E0.2
G90 ; absolute positioning
G1 Z1 ; raise a bit

G0 X95 Y220; go to char orgin
G0 Z0 ; lower to 0
G91 ; relitive positioning

; box
G0 X8 E0.2 
G0 Y13 E0.2 
G0 X-8 E0.2 
G0 Y-13 E0.2
G90 ; absolute positioning
G1 Z1 ; raise a bit

G0 X104 Y220; go to char orgin
G0 Z0 ; lower to 0
G91 ; relitive positioning

; box
G0 X8 E0.2 
G0 Y13 E0.2 
G0 X-8 E0.2 
G0 Y-13 E0.2
G90 ; absolute positioning
G1 Z1 ; raise a bit

G0 X113 Y220; go to char orgin
G0 Z0 ; lower to 0
G91 ; relitive positioning

; box
G0 X8 E0.2 
G0 Y13 E0.2 
G0 X-8 E0.2 
G0 Y-13 E0.2
G90 ; absolute positioning
G1 Z1 ; raise a bit

G1 Z10 ;Raise Z
G90 ;Absolute positioning
G1 X0 Y220 ;Present print
M84 X Y E ;Disable all steppers but Z
