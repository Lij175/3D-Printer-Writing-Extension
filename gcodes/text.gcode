; base skeleton code for writing

G28 ; Home all axes
G1 Z2 ; Move Z Axis up little to prevent scratching of Heat Bed
G1 X110 Y110 ; go to center

; Stuff Go Here

G0 X50 Y220; go to char orgin
G0 Z0 ; lower to 0
G91 ; relitive positioning

; A
G0 X4.0 Y13.0 E0.2 
G0 X4.0 Y-13.0 E0.2 
G1 Z1
G0 X-6.154 Y6.0 E0 
G1 Z-1
G0 X4.308 Y0.0 E0.2 
G90 ; absolute positioning
G1 Z1 ; raise a bit

G0 X60 Y220; go to char orgin
G0 Z0 ; lower to 0
G91 ; relitive positioning

; S
G1 Z1
G0 X8.0 Y10.0 E0 
G1 Z-1
G0 X-0.0315 Y0.376 E0.2 
G0 X-0.0942 Y0.3701 E0.2 
G0 X-0.1552 Y0.3583 E0.2 
G0 X-0.2139 Y0.3409 E0.2 
G0 X-0.2691 Y0.3181 E0.2 
G0 X-0.3202 Y0.2902 E0.2 
G0 X-0.3662 Y0.2579 E0.2 
G0 X-0.4064 Y0.2215 E0.2 
G0 X-0.4402 Y0.1815 E0.2 
G0 X-0.467 Y0.1387 E0.2 
G0 X-0.4866 Y0.0937 E0.2 
G0 X-0.4983 Y0.0472 E0.2 
G0 X-0.5024 Y0.0 E0.2 
G0 X-0.4983 Y-0.0472 E0.2 
G0 X-0.4866 Y-0.0937 E0.2 
G0 X-0.467 Y-0.1387 E0.2 
G0 X-0.4402 Y-0.1815 E0.2 
G0 X-0.4064 Y-0.2215 E0.2 
G0 X-0.3662 Y-0.2579 E0.2 
G0 X-0.3202 Y-0.2902 E0.2 
G0 X-0.2691 Y-0.3181 E0.2 
G0 X-0.2139 Y-0.3409 E0.2 
G0 X-0.1552 Y-0.3583 E0.2 
G0 X-0.0942 Y-0.3701 E0.2 
G0 X-0.0315 Y-0.376 E0.2 
G0 X0.0 Y-1.0 E0.2 
G0 X0.0315 Y-0.3133 E0.2 
G0 X0.0942 Y-0.3084 E0.2 
G0 X0.1552 Y-0.2986 E0.2 
G0 X0.2139 Y-0.2841 E0.2 
G0 X0.2691 Y-0.2651 E0.2 
G0 X0.3202 Y-0.2419 E0.2 
G0 X0.3662 Y-0.2149 E0.2 
G0 X0.4064 Y-0.1845 E0.2 
G0 X0.4402 Y-0.1513 E0.2 
G0 X0.467 Y-0.1155 E0.2 
G0 X0.4866 Y-0.0781 E0.2 
G0 X0.4983 Y-0.0394 E0.2 
G0 X0.5013 Y-0.0197 E0.2 
G0 X0.4935 Y-0.0588 E0.2 
G0 X0.4777 Y-0.0971 E0.2 
G0 X0.4545 Y-0.1336 E0.2 
G0 X0.4241 Y-0.1683 E0.2 
G0 X0.3871 Y-0.2001 E0.2 
G0 X0.3439 Y-0.2288 E0.2 
G0 X0.2952 Y-0.254 E0.2 
G0 X0.242 Y-0.2752 E0.2 
G0 X0.1849 Y-0.2919 E0.2 
G0 X0.1249 Y-0.304 E0.2 
G0 X0.063 Y-0.3115 E0.2 
G0 X0.0 Y-1.0 E0.2 
G0 X-0.0315 Y-0.376 E0.2 
G0 X-0.0942 Y-0.3701 E0.2 
G0 X-0.1552 Y-0.3583 E0.2 
G0 X-0.2139 Y-0.3409 E0.2 
G0 X-0.2691 Y-0.3181 E0.2 
G0 X-0.3202 Y-0.2902 E0.2 
G0 X-0.3662 Y-0.2579 E0.2 
G0 X-0.4064 Y-0.2215 E0.2 
G0 X-0.4402 Y-0.1815 E0.2 
G0 X-0.467 Y-0.1387 E0.2 
G0 X-0.4866 Y-0.0937 E0.2 
G0 X-0.4983 Y-0.0472 E0.2 
G0 X-0.5024 Y0.0 E0.2 
G0 X-0.4983 Y0.0472 E0.2 
G0 X-0.4866 Y0.0937 E0.2 
G0 X-0.467 Y0.1387 E0.2 
G0 X-0.4402 Y0.1815 E0.2 
G0 X-0.4064 Y0.2215 E0.2 
G0 X-0.3662 Y0.2579 E0.2 
G0 X-0.3202 Y0.2902 E0.2 
G0 X-0.2691 Y0.3181 E0.2 
G0 X-0.2139 Y0.3409 E0.2 
G0 X-0.1552 Y0.3583 E0.2 
G0 X-0.0942 Y0.3701 E0.2 
G0 X-0.0315 Y0.376 E0.2 
G90 ; absolute positioning
G1 Z1 ; raise a bit

G0 X70 Y220; go to char orgin
G0 Z0 ; lower to 0
G91 ; relitive positioning

; D
G0 X4.0 Y0.0 E0.2 
G0 X0.5013 Y0.0315 E0.2 
G0 X0.4935 Y0.0942 E0.2 
G0 X0.4777 Y0.1552 E0.2 
G0 X0.4545 Y0.2139 E0.2 
G0 X0.4241 Y0.2691 E0.2 
G0 X0.3871 Y0.3202 E0.2 
G0 X0.3439 Y0.3662 E0.2 
G0 X0.2952 Y0.4064 E0.2 
G0 X0.242 Y0.4402 E0.2 
G0 X0.1849 Y0.467 E0.2 
G0 X0.1249 Y0.4866 E0.2 
G0 X0.063 Y0.4983 E0.2 
G0 X0.0 Y5.0 E0.2 
G0 X-0.0315 Y0.5013 E0.2 
G0 X-0.0942 Y0.4935 E0.2 
G0 X-0.1552 Y0.4777 E0.2 
G0 X-0.2139 Y0.4545 E0.2 
G0 X-0.2691 Y0.4241 E0.2 
G0 X-0.3202 Y0.3871 E0.2 
G0 X-0.3662 Y0.3439 E0.2 
G0 X-0.4064 Y0.2952 E0.2 
G0 X-0.4402 Y0.242 E0.2 
G0 X-0.467 Y0.1849 E0.2 
G0 X-0.4866 Y0.1249 E0.2 
G0 X-0.4983 Y0.063 E0.2 
G0 X-4.0 Y0.0 E0.2 
G1 Z1
G0 X1.0 Y0.0 E0 
G1 Z-1
G0 X0.0 Y-13.0 E0.2 
G90 ; absolute positioning
G1 Z1 ; raise a bit

G1 Z10 ;Raise Z
G90 ;Absolute positioning
G1 X0 Y220 ;Present print
M84 X Y E ;Disable all steppers but Z
